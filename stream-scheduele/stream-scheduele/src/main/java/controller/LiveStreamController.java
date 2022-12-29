package controller;
import model.LiveStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;
@RestController
@RequestMapping("/streams")
public class LiveStreamController {
@GetMapping
    public List<LiveStream> findall(){
        return null;
    }

}
