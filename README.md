# Giter8 Template for TMT 

This is a Giter8 template for a TMT component developer which creates a sample `sbt` project for CSW Components.
The created project contains three subprojects:

- An Assembly
- An HCD
- A Deploy module, containing code to run the components

## Getting Started

### Install Coursier
Please follow the [coursier installation](https://get-coursier.io/docs/cli-installation)

### Install Giter8

`cs install giter8`

### Create new project using giter8 template

`g8 tmtsoftware/csw.g8`

This template will prompt for the following parameters. Press Enter to accept the default values, shown in brackets:

- `name [sample]`: The name of the project.
- `assemblyComponentName [sample]` : The Component Name of the Assembly
- `hcdComponentName [sampleHcd]` : The Component Name of the HCD
- `organization [org.tmt]`: Specifies the organization for this project.
- `subsystem [CSW]`: Specifies the subsystem name.
- `version [0.0.1]`: Specifies the component version for this project.
- `package [org.tmt.csw]`: Top level package which dynamically gets created based on provided organization and subsystem in all subprojects.
- `deploy_module [sample-deploy]`: Subproject name which holds HostConfig and ContainerCmd applications.
- `assembly_module [sample]`: Subproject name which holds the Assembly code.
- `hcd_module [samplehcd]`: Subproject name which holds the HCD code.
- `scala_version [2.13.3]`: Specifies the Scala version for this project.

---
**NOTE**
Following section is intended only for testing purpose and can be skipped by the consumers of template.

#### Testing the template

For people interested in testing the template with the latest commit on the dev branch (active development branch), refer [TESTING.md](TESTING.md)
