// Cheloniidae Turtle Graphics
// Created by Spencer Tipping and licensed under the terms of the MIT source code license

package cheloniidae.commands;

import cheloniidae.Turtle;

public class Debug extends UnaryCommand<String> {
  public Debug (String value) {super (value);}
  public Debug applyTo (Turtle t) {
    System.err.println (super.value () + " " + t.toString ());
    return this;
  }
}
