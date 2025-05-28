package demo;


import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DemoTime
{
    public String nowString( String timezone )
    {
        return Instant.now()
            .atZone( timezone == null ? ZoneOffset.UTC : ZoneId.of( timezone ) )
            .truncatedTo( ChronoUnit.SECONDS )
            .format( DateTimeFormatter.ISO_LOCAL_DATE_TIME );
    }
}
