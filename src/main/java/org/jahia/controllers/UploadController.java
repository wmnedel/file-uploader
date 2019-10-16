package org.jahia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
    /**
     * FOR DEVELOPMENT PURPOSE
     * used to test /file-uploader POST request
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/file-uploader")
    public @ResponseBody String form() {
        return "<html>"
            + "<body>"
            + "<form method=\"POST\" enctype=\"multipart/form-data\" action=\"/cms/file-uploader\">"
            + "<input type=\"file\" name=\"file\" />"
            + "<input type=\"submit\" value=\"Upload\" />"
            + "</form>"
            + "</body>"
            + "</html>";
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/file-uploader")
    public @ResponseBody String upload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "file is empty";
        }
        //do some stuff with the zip content
        return "OK";
    }
}
