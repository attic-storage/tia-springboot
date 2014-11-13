package commands

import org.crsh.cli.Command;
import org.crsh.cli.Usage;
import org.crsh.cli.Option;

class hello {
  @Command
  Object main(
     @Option(names=["n","name"])
     String name) {
    if (name == null)
      name = "World";
    return "Hello, " + name + "!";
  }
}
