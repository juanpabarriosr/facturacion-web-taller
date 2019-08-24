node {

	stage('Clonar repositorio Git'){
		//Instrucciones...
		echo 'Clonar repositorio Git ...'
		git '/c/fuentes/facturacion-web-taller'
	}
	
	stage('Compilar Proyecto'){
		//Instrucciones
		echo 'Compilando el proyecto'
		bat 'mvn clean compile'
	}
	
	stage('Pruebas Unitarias'){
		//Instrucciones
		echo 'Ejecutando Pruebas Unitarias ...'
		bat 'mvn test'
		junit '**/target/surefire-reports/*.xml'
	}
}

