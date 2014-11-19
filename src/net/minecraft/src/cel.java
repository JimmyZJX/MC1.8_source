package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ import org.apache.logging.log4j.LogManager;
/*   4:    */ import org.apache.logging.log4j.Logger;
/*   5:    */ 
/*   6:    */ public class cel
/*   7:    */   implements IChunkProvider
/*   8:    */ {
/*   9: 20 */   private static final Logger a = LogManager.getLogger();
/*  10:    */   private Chunk b;
/*  11: 23 */   private ur c = new ur();
/*  12: 24 */   private List<Chunk> d = Lists.newArrayList();
/*  13:    */   private World e;
/*  14:    */   
/*  15:    */   public cel(World paramaqu)
/*  16:    */   {
/*  17: 28 */     this.b = new bfg(paramaqu, 0, 0);
/*  18:    */     
/*  19: 30 */     this.e = paramaqu;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public boolean a(int paramInt1, int paramInt2)
/*  23:    */   {
/*  24: 35 */     return true;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public void b(int paramInt1, int paramInt2)
/*  28:    */   {
/*  29: 39 */     Chunk localbfh = getChunk(paramInt1, paramInt2);
/*  30: 40 */     if (!localbfh.f()) {
/*  31: 41 */       localbfh.d();
/*  32:    */     }
/*  33: 44 */     this.c.d(ChunkID.toLong(paramInt1, paramInt2));
/*  34: 45 */     this.d.remove(localbfh);
/*  35:    */   }
/*  36:    */   
/*  37:    */   public Chunk c(int paramInt1, int paramInt2)
/*  38:    */   {
/*  39: 50 */     Chunk localbfh = new Chunk(this.e, paramInt1, paramInt2);
/*  40: 51 */     this.c.a(ChunkID.toLong(paramInt1, paramInt2), localbfh);
/*  41: 52 */     this.d.add(localbfh);
/*  42: 53 */     localbfh.c(true);
/*  43:    */     
/*  44: 55 */     return localbfh;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public Chunk getChunk(int paramInt1, int paramInt2)
/*  48:    */   {
/*  49: 60 */     Chunk localbfh = (Chunk)this.c.a(ChunkID.toLong(paramInt1, paramInt2));
/*  50: 61 */     if (localbfh == null) {
/*  51: 62 */       return this.b;
/*  52:    */     }
/*  53: 65 */     return localbfh;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public boolean a(boolean paramBoolean, uy paramuy)
/*  57:    */   {
/*  58: 70 */     return true;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void c() {}
/*  62:    */   
/*  63:    */   public boolean d()
/*  64:    */   {
/*  65: 79 */     long l = System.currentTimeMillis();
/*  66: 81 */     for (Chunk localbfh : this.d) {
/*  67: 82 */       localbfh.b(System.currentTimeMillis() - l > 5L);
/*  68:    */     }
/*  69: 84 */     if (System.currentTimeMillis() - l > 100L) {
/*  70: 85 */       a.info("Warning: Clientside chunk ticking took {} ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
/*  71:    */     }
/*  72: 87 */     return false;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public boolean e()
/*  76:    */   {
/*  77: 92 */     return false;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void a(IChunkProvider parambfe, int paramInt1, int paramInt2) {}
/*  81:    */   
/*  82:    */   public boolean a(IChunkProvider parambfe, Chunk parambfh, int paramInt1, int paramInt2)
/*  83:    */   {
/*  84:101 */     return false;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getName()
/*  88:    */   {
/*  89:106 */     return "MultiplayerChunkCache: " + this.c.a() + ", " + this.d.size();
/*  90:    */   }
/*  91:    */   
/*  92:    */   public List<SpawnListEntry> getSpawnList(EnumCreatureType paramxp, BlockPosition paramdt)
/*  93:    */   {
/*  94:111 */     return null;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public BlockPosition a(World paramaqu, String paramString, BlockPosition paramdt)
/*  98:    */   {
/*  99:116 */     return null;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public int g()
/* 103:    */   {
/* 104:121 */     return this.d.size();
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void a(Chunk parambfh, int paramInt1, int paramInt2) {}
/* 108:    */   
/* 109:    */   public Chunk a(BlockPosition paramdt)
/* 110:    */   {
/* 111:130 */     return getChunk(paramdt.getX() >> 4, paramdt.getZ() >> 4);
/* 112:    */   }
/* 113:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cel
 * JD-Core Version:    0.7.0.1
 */