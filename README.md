# file-uploader
Simple file uploader example in Jahia
# Installation
- Create a new module in Jahia Studio and put the repository URL in "Sources folder" option
- Add the following bean in file digital-factory-config/jahia/applicationcontext-custom.xml

    <bean class="org.springframework.web.multipart.commons.CommonsMultipartResolver" id="multipartResolver">
        <property name="maxUploadSize" value="10000000" />
    </bean>
- Usage: Open the browser and navigate to localhost:8080/cms/file-uploader
