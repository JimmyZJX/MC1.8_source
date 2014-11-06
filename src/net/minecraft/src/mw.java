package net.minecraft.src;
/*  1:   */ import java.util.UUID;
/*  2:   */ 
/*  3:   */ public class mw
/*  4:   */   implements id<ls>
/*  5:   */ {
/*  6:   */   private UUID a;
/*  7:   */   
/*  8:   */   public mw() {}
/*  9:   */   
/* 10:   */   public mw(UUID paramUUID)
/* 11:   */   {
/* 12:20 */     this.a = paramUUID;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 16:   */   {
/* 17:25 */     this.a = paramhd.g();
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 21:   */   {
/* 22:30 */     paramhd.a(this.a);
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void a(ls paramls)
/* 26:   */   {
/* 27:35 */     paramls.a(this);
/* 28:   */   }
/* 29:   */   
/* 30:   */   public Entity a(WorldServer paramqt)
/* 31:   */   {
/* 32:40 */     return paramqt.a(this.a);
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     mw
 * JD-Core Version:    0.7.0.1
 */