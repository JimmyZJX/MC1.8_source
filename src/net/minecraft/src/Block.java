package net.minecraft.src;
import com.google.common.collect.ImmutableMap;

import java.util.Collection;

public abstract interface Block
{
  public abstract Collection a();
  
  public abstract Comparable getProperty(bex parambex);
  
  public abstract Block a(bex parambex, Comparable paramComparable);
  
  public abstract Block a(bex parambex);
  
  public abstract ImmutableMap<bex,Comparable> b();
  
  public abstract ProtoBlock getProto();
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bec
 * JD-Core Version:    0.7.0.1
 */