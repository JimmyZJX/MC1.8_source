package net.minecraft.src;
/*  1:   */ import com.google.common.base.Function;
/*  2:   */ import com.google.common.base.Joiner;
/*  3:   */ import com.google.common.base.Objects;
/*  4:   */ import com.google.common.base.Objects.ToStringHelper;
/*  5:   */ import com.google.common.collect.ImmutableList;
/*  6:   */ import com.google.common.collect.ImmutableMap;
/*  7:   */ import com.google.common.collect.Iterables;
/*  8:   */ import com.google.common.collect.Lists;
/*  9:   */ import com.google.common.collect.Maps;
/* 10:   */ import java.util.ArrayList;
/* 11:   */ import java.util.Arrays;
/* 12:   */ import java.util.Collection;
/* 13:   */ import java.util.Iterator;
/* 14:   */ import java.util.LinkedHashMap;
/* 15:   */ import java.util.List;
/* 16:   */ import java.util.Map;
/* 17:   */ 
/* 18:   */ public class bed
/* 19:   */ {
/* 20:16 */   private static final Joiner a = Joiner.on(", ");
/* 21:17 */   private static final Function b = new bee();
/* 22:   */   private final ProtoBlock c;
/* 23:   */   private final ImmutableList<IBlockData> d;
/* 24:   */   private final ImmutableList<beg> e;
/* 25:   */   
/* 26:   */   public bed(ProtoBlock paramatr, IBlockData... paramVarArgs)
/* 27:   */   {
/* 28:30 */     this.c = paramatr;
/* 29:   */     
/* 30:   */ 
/* 31:33 */     Arrays.sort(paramVarArgs, new bef(this));
/* 32:   */     
/* 33:   */ 
/* 34:   */ 
/* 35:   */ 
/* 36:   */ 
/* 37:39 */     this.d = ImmutableList.copyOf(paramVarArgs);
/* 38:   */     
/* 39:   */ 
/* 40:42 */     LinkedHashMap<Map,beg> localLinkedHashMap = Maps.newLinkedHashMap();
/* 41:43 */     ArrayList<beg> localArrayList = Lists.newArrayList();
/* 42:   */     
/* 43:45 */     Iterable<List> localIterable = eb.a(e());
/* 44:46 */     for (Iterator<List> localIterator = localIterable.iterator(); localIterator.hasNext();)
/* 45:   */     {
/* 46:46 */       List localObject = localIterator.next();
/* 47:47 */       Map localMap = eu.b(this.d, localObject);
/* 48:48 */       beg localbeg = new beg(paramatr, ImmutableMap.copyOf(localMap), null);
/* 49:   */       
/* 50:50 */       localLinkedHashMap.put(localMap, localbeg);
/* 51:51 */       localArrayList.add(localbeg);
/* 52:   */     }
/* 53:   */     Object localObject;
/* 54:54 */     for (Iterator<beg> localIterator = localArrayList.iterator(); localIterator.hasNext();)
/* 55:   */     {
/* 56:54 */       localObject = (beg)localIterator.next();
/* 57:55 */       ((beg)localObject).a(localLinkedHashMap);
/* 58:   */     }
/* 59:58 */     this.e = ImmutableList.copyOf(localArrayList);
/* 60:   */   }
/* 61:   */   
/* 62:   */   public ImmutableList<beg> a()
/* 63:   */   {
/* 64:62 */     return this.e;
/* 65:   */   }
/* 66:   */   
/* 67:   */   private List<Collection> e()
/* 68:   */   {
/* 69:66 */     ArrayList<Collection> localArrayList = Lists.newArrayList();
/* 70:67 */     for (int i = 0; i < this.d.size(); i++) {
/* 71:68 */       localArrayList.add(((IBlockData)this.d.get(i)).getValues());
/* 72:   */     }
/* 73:71 */     return localArrayList;
/* 74:   */   }
/* 75:   */   
/* 76:   */   public Block b()
/* 77:   */   {
/* 78:75 */     return (Block)this.e.get(0);
/* 79:   */   }
/* 80:   */   
/* 81:   */   public ProtoBlock c()
/* 82:   */   {
/* 83:79 */     return this.c;
/* 84:   */   }
/* 85:   */   
/* 86:   */   public Collection d()
/* 87:   */   {
/* 88:83 */     return this.d;
/* 89:   */   }
/* 90:   */   
/* 91:   */   public String toString()
/* 92:   */   {
/* 93:88 */     return Objects.toStringHelper(this).add("block", ProtoBlock.c.c(this.c)).add("properties", Iterables.transform(this.d, b)).toString();
/* 94:   */   }
/* 95:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bed
 * JD-Core Version:    0.7.0.1
 */