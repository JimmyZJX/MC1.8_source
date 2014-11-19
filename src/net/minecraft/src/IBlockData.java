package net.minecraft.src;
import java.util.Collection;

public abstract interface IBlockData <T extends Comparable<?>>
{
  public abstract String getName();
  
  public abstract Collection<T> getValues();
  
  public abstract Class<T> getType();
  
  public abstract String toString(T paramComparable);
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bex
 * JD-Core Version:    0.7.0.1
 */