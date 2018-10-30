# Setup

Setting up a Spring application

## Learning Objectives

1. Structure/Generate an application with the Spring Initializr
1. List the steps required to open the project in IntelliJ

## Instructions

### The Initializr

1. Visit the [Spring Initializr](https://start.spring.io/)
1. Populate the form with the following:
    - Generate a `Maven Project` with `Java` and Spring Boot `2.0.6`
    - Group: `com.setup`
    - Artifact: `demo`
    - Dependencies: leave empty
1. Click `Generate Project`

_Learning Objective Check Point: Structure/Generate an application with the Spring Initializr_

### Workspace
The initializr has provided us with a spring application. As part of the prerequisites we created a workspace directory, we'll move our project to that directory now

1. Unzip the demo.zip file
1. Move the unzipped demo folder to your workspace directory
```
    |-- ~
    |   |--workspace
    |   |   |-- demo

```

### IntelliJ

Once the zip file has downloaded, we're ready to open the project in IntelliJ

1. Open IntelliJ
1. Select `open`
1. Navigate to the demo directory, select the `pom.xml` file
1. When prompted, select `Open as Project`
1. If prompted, select `New Window` 

Look around the file structure, and when ready move on to the next drill where we'll create and run a simple application.

_Learning Objective Check Point: List the steps required to open the project in IntelliJ_
