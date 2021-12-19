package org.doublem.org.pomos.model.user;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PomosUserTest {

    @Test
    public void searchPomosUser() throws Exception {
        PomosUser mock = PomosUser.builder().build();
        assertThat(mock).isNotNull();
    }

}
