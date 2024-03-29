package pl.roclawski.bartek.spring.studies.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.roclawski.bartek.spring.studies.service.DashBoardService;

import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/dashboard")
public class DashBoardController {

    private static final Logger LOGGER = Logger.getLogger(DashBoardController.class.getName());

    //    @Autowired
    private final DashBoardService dashBoardService;

    public DashBoardController(DashBoardService dashBoardService) {
        this.dashBoardService = dashBoardService;
    }

    @GetMapping
    public String dashboard(String name) {
        LOGGER.info("dashboard(" + name + ")");
        dashBoardService.dashBoard();
        return "dashboard.html";
    }
}

// TODO: 24.03.2023 Zrobić pull request dla istniejących brachy
//  Rozpropagować wuświetlanie listy elementów dla pozostałych controllerów
//  Lista elementów pobierana z bazy danych