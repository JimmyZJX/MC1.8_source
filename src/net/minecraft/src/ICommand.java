package net.minecraft.src;
import java.util.List;

public abstract interface ICommand
  extends Comparable<ICommand>
{
  public abstract String c();
  
  public abstract String c(ICommandSender paramae);
  
  public abstract List<String> b();
  
  public abstract void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException;
  
  public abstract boolean a(ICommandSender paramae);
  
  public abstract List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt);
  
  public abstract boolean b(String[] paramArrayOfString, int paramInt);
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ac
 * JD-Core Version:    0.7.0.1
 */