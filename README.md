# file-uploader
Simple file uploader example for Jahia
# Installation
- Create a new module in Jahia Studio using this repository URL in "Sources folder" option
- IMPORTANT: enable the module into systemsite:
	Administration mode -> System Components -> Modules -> file-uploader -> enable it
- Add the bean definition multipartResolver, described in the file applicationcontext-custom.xml
of this project into your file digital-factory-config/jahia/applicationcontext-custom.xml
- Usage: Open the browser and navigate to localhost:8080/cms/file-uploader
