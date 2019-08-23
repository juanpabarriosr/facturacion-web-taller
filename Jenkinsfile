node {

	stage('Descargar Fuentes'){
		//Instrucciones...
		echo 'Descargando Fuentes ...'
		git '/c/fuentes/facturacion-web'
	}
	
	stage('Compilar'){
		//Instrucciones
		echo 'Compilando ...'
		bat 'mvn clean compile'
	}

	stage('Pruebas Unitarias'){
		//Instrucciones
		echo 'Ejecutando Pruebas Unitarias ...'
		bat 'mvn test'
		junit '**/target/surefire-reports/*.xml'
	}
}