package net.minecraft.src;
/*  1:   */ import com.google.gson.Gson;
/*  2:   */ import com.google.gson.GsonBuilder;
/*  3:   */ 
/*  4:   */ public class no
/*  5:   */   implements id<nm>
/*  6:   */ {
/*  7:14 */   private static final Gson a = new GsonBuilder().registerTypeAdapter(nt.class, new nu()).registerTypeAdapter(nq.class, new nr()).registerTypeAdapter(np.class, new ns()).registerTypeHierarchyAdapter(ho.class, new hp()).registerTypeHierarchyAdapter(hv.class, new hx()).registerTypeAdapterFactory(new ut()).create();
/*  8:   */   private np b;
/*  9:   */   
/* 10:   */   public no() {}
/* 11:   */   
/* 12:   */   public no(np paramnp)
/* 13:   */   {
/* 14:30 */     this.b = paramnp;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 18:   */   {
/* 19:35 */     this.b = ((np)a.fromJson(paramhd.c(32767), np.class));
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 23:   */   {
/* 24:40 */     paramhd.a(a.toJson(this.b));
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void a(nm paramnm)
/* 28:   */   {
/* 29:45 */     paramnm.a(this);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public np a()
/* 33:   */   {
/* 34:49 */     return this.b;
/* 35:   */   }
/* 36:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     no
 * JD-Core Version:    0.7.0.1
 */