package com.stats.StatisticProject;

import com.stats.StatisticProject.dao.GameRepository;
import com.stats.StatisticProject.entity.Game;
import org.junit.jupiter.api.*;
        import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class RepositoryLayerTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private GameRepository gameRepository;

    @BeforeEach
    public void Create_test_object(){

    }

    @Test
    void Insert_test_object(){

        Game game = new Game("Bob", "Andrew", "W", 7, 4, "today");

        gameRepository.addPlayer(game);

        Assertions.assertNotEquals(game, null);
    }

}
