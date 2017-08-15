package com.example.demo.processing.controller;

import com.example.demo.domain.provider.Updategram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PostRestController {
    private static final Logger LOG = LoggerFactory.getLogger(PostRestController.class);

    /**
     * Takes updatgram
     * looking for market set
     * outputs a map of:
     * market descriptions:
     *  selection description: probability
     *
     * @param update
     * @return
     */
    @RequestMapping(value = "/data", method = RequestMethod.POST)
    public Map<String, Map<String, Double>> processData(@RequestBody Updategram update) {
        LOG.info(update.getHeader().getMessageGuid());
        return null;
    }
}
