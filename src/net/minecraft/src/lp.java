package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;

/*  2:   */ import java.util.ArrayList;
/*  3:   */ import java.util.Collection;
/*  4:   */ import java.util.List;
/*  5:   */ import java.util.UUID;
/*  6:   */ 
/*  7:   */ public class lp
/*  8:   */   implements id<ik>
/*  9:   */ {
/* 10:   */   private int a;
/* 11:17 */   private final List<lq> b = Lists.newArrayList();
/* 12:   */   
/* 13:   */   public lp() {}
/* 14:   */   
/* 15:   */   public lp(int paramInt, Collection<xz> paramCollection)
/* 16:   */   {
/* 17:23 */     this.a = paramInt;
/* 18:25 */     for (xz localxz : paramCollection) {
/* 19:26 */       this.b.add(new lq(this, localxz.a().a(), localxz.b(), localxz.c()));
/* 20:   */     }
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 24:   */   {
/* 25:32 */     this.a = paramhd.e();
/* 26:   */     
/* 27:34 */     int i = paramhd.readInt();
/* 28:35 */     for (int j = 0; j < i; j++)
/* 29:   */     {
/* 30:36 */       String str = paramhd.c(64);
/* 31:37 */       double d = paramhd.readDouble();
/* 32:38 */       ArrayList localArrayList = Lists.newArrayList();
/* 33:39 */       int k = paramhd.e();
/* 34:41 */       for (int m = 0; m < k; m++)
/* 35:   */       {
/* 36:42 */         UUID localUUID = paramhd.g();
/* 37:43 */         localArrayList.add(new ya(localUUID, "Unknown synced attribute modifier", paramhd.readDouble(), paramhd.readByte()));
/* 38:   */       }
/* 39:46 */       this.b.add(new lq(this, str, d, localArrayList));
/* 40:   */     }
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 44:   */   {
/* 45:52 */     paramhd.b(this.a);
/* 46:53 */     paramhd.writeInt(this.b.size());
/* 47:55 */     for (lq locallq : this.b)
/* 48:   */     {
/* 49:56 */       paramhd.a(locallq.a());
/* 50:57 */       paramhd.writeDouble(locallq.b());
/* 51:58 */       paramhd.b(locallq.c().size());
/* 52:60 */       for (ya localya : locallq.c())
/* 53:   */       {
/* 54:61 */         paramhd.a(localya.a());
/* 55:62 */         paramhd.writeDouble(localya.d());
/* 56:63 */         paramhd.writeByte(localya.c());
/* 57:   */       }
/* 58:   */     }
/* 59:   */   }
/* 60:   */   
/* 61:   */   public void a(ik paramik)
/* 62:   */   {
/* 63:70 */     paramik.a(this);
/* 64:   */   }
/* 65:   */   
/* 66:   */   public int a()
/* 67:   */   {
/* 68:74 */     return this.a;
/* 69:   */   }
/* 70:   */   
/* 71:   */   public List<lq> b()
/* 72:   */   {
/* 73:78 */     return this.b;
/* 74:   */   }
/* 75:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     lp
 * JD-Core Version:    0.7.0.1
 */