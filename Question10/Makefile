versions: 
	java --version
	mvn --version

test:
	mvn test

package: versions
	mvn package -DskipTests

run: package
	java -cp target/Question10-1.0-SNAPSHOT.jar br.com.johnidouglasmarangon.App
