package net.minecraft.src;
import com.google.common.collect.ImmutableMap;

import java.util.Collection;

public abstract interface Block
{
  public abstract Collection a();
  
  public abstract Comparable getProperty(IBlockData parambex);
  
  public abstract Block setData(IBlockData parambex, Comparable paramComparable);
  
  public abstract Block a(IBlockData parambex);
  
  public abstract ImmutableMap<IBlockData,Comparable> b();
  
  public abstract ProtoBlock getProto();
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bec
 * JD-Core Version:    0.7.0.1
 */