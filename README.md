# Supplier Registry

Supplier registry project build during a Java workshop.

## Getting Started

### Development
```shell
gradle tasks	# Display available tasks

gradle build	# Build and test application
gradle test	# Test application
gradle bootRun	# Start Spring Boot application
```

### Deployment
This application is deployed on tag creation.
1.	Navigate to [Releases](https://github.com/pchalupa/supplier-registry/releases).
2.	Click on "Draft a new release" button.
3.	Create or pick a tag.
4.	Click on "Generate release notes" to auto-populate changelog.
5.	Finally click on "Publish release"

You can watch deployment progress at [Deploy](https://github.com/pchalupa/supplier-registry/actions/workflows/deploy.yml) workflow.

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/index.html)
