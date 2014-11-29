package net.minecraft.src;
/*  1:   */ import com.google.common.base.Objects;
/*  2:   */ import com.google.common.collect.Maps;
/*  3:   */ import com.google.common.collect.Sets;

/*  4:   */ import java.util.Collections;
/*  5:   */ import java.util.IdentityHashMap;
/*  6:   */ import java.util.Map;
/*  7:   */ import java.util.Set;
/*  8:   */ 
/*  9:   */ public class cnd
/* 10:   */ {
/* 11:15 */   private Map<BlockType, cni> a = Maps.newIdentityHashMap();
/* 12:16 */   private Set<BlockType> b = Sets.newIdentityHashSet();
/* 13:   */   
/* 14:   */   public void a(BlockType paramatr, cni paramcni)
/* 15:   */   {
/* 16:19 */     this.a.put(paramatr, paramcni);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(BlockType... paramVarArgs)
/* 20:   */   {
/* 21:23 */     Collections.addAll(this.b, paramVarArgs);
/* 22:   */   }
/* 23:   */   
/* 24:   */   public Map<Block,cxl> a()
/* 25:   */   {
/* 26:27 */     IdentityHashMap<Block,cxl> localIdentityHashMap = Maps.newIdentityHashMap();
/* 27:29 */     for (BlockType localatr : BlockType.c) {
/* 28:30 */       if (!this.b.contains(localatr)) {
/* 29:34 */         localIdentityHashMap.putAll(Objects.firstNonNull(this.a.get(localatr), new cne()).a(localatr));
/* 30:   */       }
/* 31:   */     }
/* 32:37 */     return localIdentityHashMap;
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cnd
 * JD-Core Version:    0.7.0.1
 */