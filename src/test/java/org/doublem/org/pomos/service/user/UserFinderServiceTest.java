package org.doublem.org.pomos.service.user;

import org.doublem.org.pomos.model.user.PomosUser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserFinderServiceTest {

    @Autowired
    private UserFinderService userFinderService;

    @Test
    @DisplayName("Testing for DI by the spring-boot :: default")
    public void contextLoads() throws Exception {

        assertThat(userFinderService).isNotNull();
    }

    @Test
    public void searchPomosUser() throws Exception {

        PomosUser result = userFinderService.searchPomosUser("1");
        assertThat(result).isNotNull();
        assertThat(result).isEqualTo(PomosUser.builder().build());
    }

}
