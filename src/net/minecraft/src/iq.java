package net.minecraft.src;
/*   1:    */ import com.mojang.authlib.GameProfile;

import java.io.IOException;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.UUID;
/*   4:    */ 
/*   5:    */ public class iq
/*   6:    */   implements id<ik>
/*   7:    */ {
/*   8:    */   private int a;
/*   9:    */   private UUID b;
/*  10:    */   private int c;
/*  11:    */   private int d;
/*  12:    */   private int e;
/*  13:    */   private byte f;
/*  14:    */   private byte g;
/*  15:    */   private int h;
/*  16:    */   private EntityData i;
/*  17:    */   private List j;
/*  18:    */   
/*  19:    */   public iq() {}
/*  20:    */   
/*  21:    */   public iq(EntityPlayer paramahd)
/*  22:    */   {
/*  23: 33 */     this.a = paramahd.getID();
/*  24: 34 */     this.b = paramahd.cc().getId();
/*  25: 35 */     this.c = MathUtils.floor(paramahd.xPos * 32.0D);
/*  26: 36 */     this.d = MathUtils.floor(paramahd.yPos * 32.0D);
/*  27: 37 */     this.e = MathUtils.floor(paramahd.zPos * 32.0D);
/*  28: 38 */     this.f = ((byte)(int)(paramahd.yaw * 256.0F / 360.0F));
/*  29: 39 */     this.g = ((byte)(int)(paramahd.pitch * 256.0F / 360.0F));
/*  30:    */     
/*  31: 41 */     ItemStack localamj = paramahd.inventory.getHeldItem();
/*  32: 42 */     this.h = (localamj == null ? 0 : Item.b(localamj.getItem()));
/*  33:    */     
/*  34: 44 */     this.i = paramahd.H();
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void fromBuffer(ByteBufWrapper paramhd) throws IOException
/*  38:    */   {
/*  39: 49 */     this.a = paramhd.e();
/*  40: 50 */     this.b = paramhd.g();
/*  41: 51 */     this.c = paramhd.readInt();
/*  42: 52 */     this.d = paramhd.readInt();
/*  43: 53 */     this.e = paramhd.readInt();
/*  44: 54 */     this.f = paramhd.readByte();
/*  45: 55 */     this.g = paramhd.readByte();
/*  46: 56 */     this.h = paramhd.readShort();
/*  47: 57 */     this.j = EntityData.readEntries(paramhd);
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void toBuffer(ByteBufWrapper paramhd)
/*  51:    */   {
/*  52: 62 */     paramhd.b(this.a);
/*  53: 63 */     paramhd.a(this.b);
/*  54: 64 */     paramhd.writeInt(this.c);
/*  55: 65 */     paramhd.writeInt(this.d);
/*  56: 66 */     paramhd.writeInt(this.e);
/*  57: 67 */     paramhd.writeByte(this.f);
/*  58: 68 */     paramhd.writeByte(this.g);
/*  59: 69 */     paramhd.writeShort(this.h);
/*  60: 70 */     this.i.a(paramhd);
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void a(ik paramik)
/*  64:    */   {
/*  65: 75 */     paramik.a(this);
/*  66:    */   }
/*  67:    */   
/*  68:    */   public List a()
/*  69:    */   {
/*  70: 79 */     if (this.j == null) {
/*  71: 80 */       this.j = this.i.c();
/*  72:    */     }
/*  73: 82 */     return this.j;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public int b()
/*  77:    */   {
/*  78: 86 */     return this.a;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public UUID c()
/*  82:    */   {
/*  83: 90 */     return this.b;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public int d()
/*  87:    */   {
/*  88: 94 */     return this.c;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public int e()
/*  92:    */   {
/*  93: 98 */     return this.d;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public int f()
/*  97:    */   {
/*  98:102 */     return this.e;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public byte g()
/* 102:    */   {
/* 103:106 */     return this.f;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public byte h()
/* 107:    */   {
/* 108:110 */     return this.g;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public int i()
/* 112:    */   {
/* 113:114 */     return this.h;
/* 114:    */   }
/* 115:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     iq
 * JD-Core Version:    0.7.0.1
 */