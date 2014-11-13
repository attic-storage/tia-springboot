package commands

import org.crsh.cli.Command;
import org.crsh.cli.Usage;
import org.crsh.cli.Option;

class date {
  @Usage("show the current time")
  @Command
  Object main(
     @Usage("the time format")
     @Option(names=["f","format"])
     String format) {
    if (format == null)
      format = "yyyy-MM-dd HH:mm:ss";
    def date = new Date();
    return date.format(format);
  }
}
