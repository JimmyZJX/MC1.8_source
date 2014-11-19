package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class bgp
/*   5:    */   implements IChunkProvider
/*   6:    */ {
/*   7: 23 */   private static final List<beg> a = Lists.newArrayList();
/*   8:    */   
/*   9:    */   static
/*  10:    */   {
/*  11: 29 */     for (ProtoBlock block : ProtoBlock.c) {
/*  12: 30 */       a.addAll(block.O().a());
/*  13:    */     }
/*  14:    */   }
/*  15:    */   
/*  16: 33 */   private static final int b = MathUtils.ceil(MathUtils.sqrt((float)a.size()));
/*  17:    */   private final World world;
/*  18:    */   
/*  19:    */   public bgp(World world)
/*  20:    */   {
/*  21: 37 */     this.world = world;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public Chunk getChunk(int paramInt1, int paramInt2)
/*  25:    */   {
/*  26: 47 */     bgk localbgk = new bgk();
/*  27: 49 */     for (int i = 0; i < 16; i++) {
/*  28: 50 */       for (int j = 0; j < 16; j++)
/*  29:    */       {
/*  30: 51 */         int k = paramInt1 * 16 + i;
/*  31: 52 */         int m = paramInt2 * 16 + j;
/*  32:    */         
/*  33: 54 */         localbgk.a(i, 60, j, BlockList.barrier.instance());
/*  34:    */         
/*  35: 56 */         Block block = b(k, m);
/*  36: 57 */         if (block != null) {
/*  37: 58 */           localbgk.a(i, 70, j, block);
/*  38:    */         }
/*  39:    */       }
/*  40:    */     }
/*  41: 63 */     Chunk localbfh = new Chunk(this.world, localbgk, paramInt1, paramInt2);
/*  42: 64 */     localbfh.generateSkylightMap();
/*  43:    */     
/*  44: 66 */     arm[] arrayOfarm = this.world.v().b(null, paramInt1 * 16, paramInt2 * 16, 16, 16);
/*  45: 67 */     byte[] arrayOfByte = localbfh.k();
/*  46: 69 */     for (int m = 0; m < arrayOfByte.length; m++) {
/*  47: 70 */       arrayOfByte[m] = ((byte)arrayOfarm[m].az);
/*  48:    */     }
/*  49: 73 */     localbfh.generateSkylightMap();
/*  50:    */     
/*  51: 75 */     return localbfh;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public static Block b(int paramInt1, int paramInt2)
/*  55:    */   {
/*  56: 80 */     Block block = null;
/*  57: 82 */     if ((paramInt1 > 0) && (paramInt2 > 0) && (paramInt1 % 2 != 0) && (paramInt2 % 2 != 0))
/*  58:    */     {
/*  59: 83 */       paramInt1 /= 2;
/*  60: 84 */       paramInt2 /= 2;
/*  61: 86 */       if ((paramInt1 <= b) && (paramInt2 <= b))
/*  62:    */       {
/*  63: 87 */         int i = MathUtils.abs(paramInt1 * b + paramInt2);
/*  64: 88 */         if (i < a.size()) {
/*  65: 89 */           block = a.get(i);
/*  66:    */         }
/*  67:    */       }
/*  68:    */     }
/*  69: 94 */     return block;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public boolean a(int paramInt1, int paramInt2)
/*  73:    */   {
/*  74: 99 */     return true;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public boolean a(IChunkProvider parambfe, Chunk parambfh, int paramInt1, int paramInt2)
/*  78:    */   {
/*  79:108 */     return false;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public boolean a(boolean paramBoolean, uy paramuy)
/*  83:    */   {
/*  84:113 */     return true;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public boolean d()
/*  88:    */   {
/*  89:122 */     return false;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public boolean e()
/*  93:    */   {
/*  94:127 */     return true;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getName()
/*  98:    */   {
/*  99:132 */     return "DebugLevelSource";
/* 100:    */   }
/* 101:    */   
/* 102:    */   public List<SpawnListEntry> getSpawnList(EnumCreatureType paramxp, BlockPosition paramdt)
/* 103:    */   {
/* 104:137 */     arm localarm = this.world.b(paramdt);
/* 105:138 */     return localarm.a(paramxp);
/* 106:    */   }
/* 107:    */   
/* 108:    */   public BlockPosition a(World paramaqu, String paramString, BlockPosition paramdt)
/* 109:    */   {
/* 110:143 */     return null;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public int g()
/* 114:    */   {
/* 115:148 */     return 0;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public Chunk a(BlockPosition paramdt)
/* 119:    */   {
/* 120:157 */     return getChunk(paramdt.getX() >> 4, paramdt.getZ() >> 4);
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void a(IChunkProvider parambfe, int paramInt1, int paramInt2) {}
/* 124:    */   
/* 125:    */   public void c() {}
/* 126:    */   
/* 127:    */   public void a(Chunk parambfh, int paramInt1, int paramInt2) {}
/* 128:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bgp
 * JD-Core Version:    0.7.0.1
 */