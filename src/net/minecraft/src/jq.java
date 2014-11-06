package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;

/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.Iterator;
/*   4:    */ import java.util.List;
/*   5:    */ 
/*   6:    */ public class jq
/*   7:    */   implements id<ik>
/*   8:    */ {
/*   9:    */   private int a;
/*  10:    */   private int b;
/*  11:    */   private jr c;
/*  12:    */   private boolean d;
/*  13:    */   
/*  14:    */   public jq() {}
/*  15:    */   
/*  16:    */   public jq(Chunk parambfh, boolean paramBoolean, int paramInt)
/*  17:    */   {
/*  18: 26 */     this.a = parambfh.x;
/*  19: 27 */     this.b = parambfh.z;
/*  20: 28 */     this.d = paramBoolean;
/*  21:    */     
/*  22: 30 */     this.c = a(parambfh, paramBoolean, !parambfh.p().t.o(), paramInt);
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void fromBuffer(ByteBufWrapper paramhd)
/*  26:    */   {
/*  27: 35 */     this.a = paramhd.readInt();
/*  28: 36 */     this.b = paramhd.readInt();
/*  29: 37 */     this.d = paramhd.readBoolean();
/*  30: 38 */     this.c = new jr();
/*  31: 39 */     this.c.b = paramhd.readShort();
/*  32: 40 */     this.c.a = paramhd.readByteArray();
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void toBuffer(ByteBufWrapper paramhd)
/*  36:    */   {
/*  37: 45 */     paramhd.writeInt(this.a);
/*  38: 46 */     paramhd.writeInt(this.b);
/*  39: 47 */     paramhd.writeBoolean(this.d);
/*  40: 48 */     paramhd.writeShort((short)(this.c.b & 0xFFFF));
/*  41: 49 */     paramhd.writeByteArray(this.c.a);
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void a(ik paramik)
/*  45:    */   {
/*  46: 54 */     paramik.a(this);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public byte[] a()
/*  50:    */   {
/*  51: 58 */     return this.c.a;
/*  52:    */   }
/*  53:    */   
/*  54:    */   protected static int a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
/*  55:    */   {
/*  56: 62 */     int i = paramInt * 2 * 16 * 16 * 16;
/*  57: 63 */     int j = paramInt * 16 * 16 * 16 / 2;
/*  58: 64 */     int k = paramBoolean1 ? paramInt * 16 * 16 * 16 / 2 : 0;
/*  59: 65 */     int m = paramBoolean2 ? 256 : 0;
/*  60: 66 */     return i + j + k + m;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public static jr a(Chunk parambfh, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
/*  64:    */   {
/*  65: 70 */     ExtendedBlockStorage[] arrayOfbfm = parambfh.getBlockStorageArray();
/*  66: 71 */     jr localjr = new jr();
/*  67:    */     
/*  68: 73 */     ArrayList localArrayList = Lists.newArrayList();
/*  69: 74 */     for (int i = 0; i < arrayOfbfm.length; i++)
/*  70:    */     {
/*  71: 75 */       ExtendedBlockStorage localObject = arrayOfbfm[i];
/*  72: 77 */       if ((localObject != null) && ((!paramBoolean1) || (!((ExtendedBlockStorage)localObject).a())) && ((paramInt & 1 << i) != 0))
/*  73:    */       {
/*  74: 78 */         localjr.b |= 1 << i;
/*  75: 79 */         localArrayList.add(localObject);
/*  76:    */       }
/*  77:    */     }
/*  78: 83 */     localjr.a = new byte[a(Integer.bitCount(localjr.b), paramBoolean2, paramBoolean1)];
/*  79: 84 */     int i = 0;
/*  80: 87 */     for (Object localObject = localArrayList.iterator(); ((Iterator)localObject).hasNext();)
/*  81:    */     {
/*  82: 87 */       ExtendedBlockStorage localbfm = (ExtendedBlockStorage)((Iterator)localObject).next();
/*  83: 88 */       char[] arrayOfChar1 = localbfm.g();
/*  84: 89 */       for (int m : arrayOfChar1)
/*  85:    */       {
/*  86: 90 */         localjr.a[(i++)] = ((byte)(m & 0xFF));
/*  87: 91 */         localjr.a[(i++)] = ((byte)(m >> 8 & 0xFF));
/*  88:    */       }
/*  89:    */     }
/*  90:    */     ExtendedBlockStorage localbfm;
/*  91: 95 */     for (Iterator<ExtendedBlockStorage> localObject = localArrayList.iterator(); ((Iterator)localObject).hasNext();)
/*  92:    */     {
/*  93: 95 */       localbfm = (ExtendedBlockStorage)((Iterator)localObject).next();
/*  94: 96 */       i = a(localbfm.h().a(), localjr.a, i);
/*  95:    */     }
/*  96: 99 */     if (paramBoolean2) {
/*  97:100 */       for (Iterator<ExtendedBlockStorage> localObject = localArrayList.iterator(); ((Iterator)localObject).hasNext();)
/*  98:    */       {
/*  99:100 */         localbfm = (ExtendedBlockStorage)((Iterator)localObject).next();
/* 100:101 */         i = a(localbfm.i().a(), localjr.a, i);
/* 101:    */       }
/* 102:    */     }
/* 103:105 */     if (paramBoolean1) {
/* 104:106 */       a(parambfh.k(), localjr.a, i);
/* 105:    */     }
/* 106:109 */     return localjr;
/* 107:    */   }
/* 108:    */   
/* 109:    */   private static int a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
/* 110:    */   {
/* 111:113 */     System.arraycopy(paramArrayOfByte1, 0, paramArrayOfByte2, paramInt, paramArrayOfByte1.length);
/* 112:114 */     return paramInt + paramArrayOfByte1.length;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public int b()
/* 116:    */   {
/* 117:118 */     return this.a;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public int c()
/* 121:    */   {
/* 122:122 */     return this.b;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public int d()
/* 126:    */   {
/* 127:126 */     return this.c.b;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public boolean e()
/* 131:    */   {
/* 132:130 */     return this.d;
/* 133:    */   }
/* 134:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     jq
 * JD-Core Version:    0.7.0.1
 */