package model;
import java.time.LocalDateTime;
    public record LiveStream (String id, String title, String description, String url, LocalDateTime startDate, LocalDateTime endDate){

        public String url() {
            return url;
        }


        public String title() {
            return title;
        }

        public LocalDateTime startDate() {
            return startDate;
        }


        public LocalDateTime endDate() {
            return endDate;
        }


        public String description() {
            return description;
        }


        public String id() {
            return id;
        }

        public LiveStream(String id, String title, String description, String url, LocalDateTime startDate, LocalDateTime endDate) {
    this.id=id;
    this.title=title;
    this.description=description;
    this.url=url;
    this.startDate=startDate;
    this.endDate=endDate;
        }
    }


