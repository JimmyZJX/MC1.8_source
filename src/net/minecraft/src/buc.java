package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  3:   */ 
/*  4:   */ public class buc
/*  5:   */ {
/*  6:20 */   private static final oa a = new oa("textures/map/map_icons.png");
/*  7:   */   private final cug b;
/*  8:24 */   private final Map<String,MapRenderer> c = Maps.newHashMap();
/*  9:   */   
/* 10:   */   public buc(cug paramcug)
/* 11:   */   {
/* 12:27 */     this.b = paramcug;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(MapInfo parambqe)
/* 16:   */   {
/* 17:31 */     MapRenderer.a(b(parambqe));
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void a(MapInfo parambqe, boolean paramBoolean)
/* 21:   */   {
/* 22:35 */     MapRenderer.a(b(parambqe), paramBoolean);
/* 23:   */   }
/* 24:   */   
/* 25:   */   private MapRenderer b(MapInfo parambqe)
/* 26:   */   {
/* 27:39 */     MapRenderer localbue = (MapRenderer)this.c.get(parambqe.a);
/* 28:41 */     if (localbue == null)
/* 29:   */     {
/* 30:42 */       localbue = new MapRenderer(this, parambqe, null);
/* 31:43 */       this.c.put(parambqe.a, localbue);
/* 32:   */     }
/* 33:45 */     return localbue;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void a()
/* 37:   */   {
/* 38:49 */     for (MapRenderer localbue : this.c.values()) {
/* 39:50 */       this.b.c(MapRenderer.b(localbue));
/* 40:   */     }
/* 41:53 */     this.c.clear();
/* 42:   */   }
			  static cug a(buc arg0) {return arg0.b;}
			  static oa b() {return a;}
/* 43:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     buc
 * JD-Core Version:    0.7.0.1
 */