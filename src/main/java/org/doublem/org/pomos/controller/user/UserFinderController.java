package org.doublem.org.pomos.controller.user;

import lombok.AllArgsConstructor;
import org.doublem.org.pomos.model.user.PomosUser;
import org.doublem.org.pomos.service.user.UserFinderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserFinderController {

    private UserFinderService userFinderService;

    @GetMapping("users/{id}")
    PomosUser getPomosUser(@PathVariable("id") String id){
        return userFinderService.searchPomosUser(id);
    };

}
