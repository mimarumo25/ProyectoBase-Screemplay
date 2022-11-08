#!groovy
import java.text.SimpleDateFormat

def dateFormat = new SimpleDateFormat("yyyyMMddHHmm")
def date = new Date()
def timestamp = dateFormat.format(date).toString()
def Correo = "mrubidem@choucairtesting.com"

pipeline {
    agent any
    stages {
        stage('Ejecutar Pruebas') {
            steps {
                script {
                    try {
                        //bat ("gradle clean test -DRunner=\"${Runner}\" aggregate") //Ejecución en agente Windows con parametro jenkins
                        //sh ("gradle clean test -DRunner=\"${Runner}\" aggregate") //Ejecución en agente Linux con parametro jenkins
                            bat("gradle clean test aggregate") //Ejecución en agente windows sin parametro jenkins
                        echo 'Test Ejecutados sin Fallo'
                        currentBuild.result = 'SUCCESS'
                    }
                    catch (ex) {
                        echo 'Test Ejecutados con Fallo'
                        currentBuild.result = 'UNSTABLE'
                    }
                }
            }
        }

                stage('Generar evidencia'){
                    steps
                            {
                                script
                                        {
                                            try
                                            {
                                                bat  " rename \"${WORKSPACE}\\target\" serenity_${timestamp}"
                                                echo 'Backup de evidencias realizado con exito'

                                                publishHTML([
                                                        allowMissing: false,
                                                        alwaysLinkToLastBuild: true,
                                                        keepAll: true,
                                                        reportDir: "${WORKSPACE}//serenity_${timestamp}",
                                                        reportFiles: 'index.html',
                                                        reportName: 'Evidencias Automatizacion SwagLabs',
                                                        reportTitles: 'Proyecto SwagLabs WEB POM'
                                                ])
                                                echo 'Reporte Html realizado con exito'

                                            }
                                            catch(e)
                                            {
                                                echo 'No se realizo el Backup de evidencias'
                                                publishHTML([allowMissing: false, alwaysLinkToLastBuild: true, keepAll: true, reportDir: "${WORKSPACE}//target/serenity_${timestamp}", reportFiles: 'index.html', reportName: 'Evidencias Automatizacion SwagLabs', reportTitles: 'Proyecto SwagLabs WEB POM'])
                                                echo 'Reporte Html realizado con exito'
                                                currentBuild.result='SUCCESS'
                                            }
                                        }
                            }
                }


    }
}
