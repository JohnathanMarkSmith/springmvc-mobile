package com.johnathanmsmith.mvc.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.site.SitePreference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ask")
class IndexController {

	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String displayRequestPage(Device device, SitePreference sitePreference) {

        logger.info("SitePreference : " + sitePreference);
        logger.info("Device : " + device);

        String page = "index";

        if (device.isMobile()) {
            logger.info("Hello mobile user!");
            page = page  + "-mobile";
        } else if (device.isTablet()) {
            logger.info("Hello tablet user!");
            page = page  + "-tablet";
        } else {
            logger.info("Hello desktop user!");
        }
        return "index";
     }


}
