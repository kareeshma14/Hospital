In a Hospital the management wants to computerize Doctor’s information to systematic way where user can add doctor , update doctor , fetch all doctor data. Each Employee has properties like id, name , salary, specialist. Create a Springboot based REST api application where implement the below functionality.

1. Create the Doctors data . If Doctor id is already exists in the database then throw an exception “ Doctor already exists in the database”.

2. Fetch all doctor based on their salary in descending order . If two doctor salary is same then then fetch based on their name in ascending order.

3. Update an doctor salary by passing salary as path variable . After successfully update it should show the updated salary in the postman output.

After successfully Create the above application on Java-Springboot restapi do the following work .

1. Make a build in maven. Get the latest jar file under target folder.

2. Commit and push the code into GITHUB repository.

3. Make Jenkins pipeline . So that anytime a commit will make in GITHUB will automatically build a jar file into Jenkins.

4. Dockerize the above application by using Docker compose.

After successfully complete the above Devops steps do the following work in Microsoft-Azure .

1. Deploy the Springboot Rest api into Microsoft Azure.

2. Make the application Orchestration enabled by using Azure Kubernetes features.
