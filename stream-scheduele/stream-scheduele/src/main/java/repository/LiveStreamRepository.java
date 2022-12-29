package repository;
import model.LiveStream;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LiveStreamRepository {
    List<LiveStream> streams = new ArrayList<>();

    public LiveStreamRepository(){
        streams.add(new LiveStream(
                UUID.randomUUID().toString(),
                title:"Building REST APIs",
                desciption:"",
                url:"https://www.twitch.tv/xqc"
        ))
    }
    public List<LiveStream> findall(){
        return streams;
    }
    public LiveStream findById(String id){
        return streams.stream().filter(stream-> stream.id().equals(id).findFirst().orElse));
    }
    public void update(LiveStream stream,String id)
}
