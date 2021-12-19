package org.doublem.org.pomos.service.user;

import org.doublem.org.pomos.model.user.PomosUser;
import org.springframework.stereotype.Service;

/**
 * UserFinderService is aimed to search user of the pomos
 */
@Service
public class UserFinderService {

    public PomosUser searchPomosUser(String uuid){
        return new PomosUser();
    }


}
