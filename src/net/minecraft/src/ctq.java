package net.minecraft.src;
/*   1:    */ import java.awt.image.BufferedImage;
/*   2:    */ import java.io.File;
/*   3:    */ import java.io.IOException;
/*   4:    */ import java.util.concurrent.atomic.AtomicInteger;
/*   5:    */ import javax.imageio.ImageIO;
/*   6:    */ import org.apache.logging.log4j.LogManager;
/*   7:    */ import org.apache.logging.log4j.Logger;
/*   8:    */ 
/*   9:    */ public class ctq
/*  10:    */   extends ctv
/*  11:    */ {
/*  12: 21 */   private static final Logger g = LogManager.getLogger();
/*  13: 22 */   private static final AtomicInteger h = new AtomicInteger(0);
/*  14:    */   private final File i;
/*  15:    */   private final String j;
/*  16:    */   private final ckh k;
/*  17:    */   private BufferedImage l;
/*  18:    */   private Thread m;
/*  19:    */   private boolean n;
/*  20:    */   
/*  21:    */   public ctq(File paramFile, String paramString, oa paramoa, ckh paramckh)
/*  22:    */   {
/*  23: 33 */     super(paramoa);
/*  24: 34 */     this.i = paramFile;
/*  25: 35 */     this.j = paramString;
/*  26: 36 */     this.k = paramckh;
/*  27:    */   }
/*  28:    */   
/*  29:    */   private void g()
/*  30:    */   {
/*  31: 40 */     if (this.n) {
/*  32: 41 */       return;
/*  33:    */     }
/*  34: 45 */     if (this.l != null)
/*  35:    */     {
/*  36: 47 */       if (this.f != null) {
/*  37: 48 */         c();
/*  38:    */       }
/*  39: 51 */       cuj.a(super.b(), this.l);
/*  40: 52 */       this.n = true;
/*  41:    */     }
/*  42:    */   }
/*  43:    */   
/*  44:    */   public int b()
/*  45:    */   {
/*  46: 58 */     g();
/*  47:    */     
/*  48: 60 */     return super.b();
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void a(BufferedImage paramBufferedImage)
/*  52:    */   {
/*  53: 64 */     this.l = paramBufferedImage;
/*  54: 65 */     if (this.k != null) {
/*  55: 66 */       this.k.a();
/*  56:    */     }
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void a(cvk paramcvk) throws IOException
/*  60:    */   {
/*  61: 73 */     if ((this.l == null) && (this.f != null)) {
/*  62: 74 */       super.a(paramcvk);
/*  63:    */     }
/*  64: 78 */     if (this.m == null) {
/*  65: 79 */       if ((this.i != null) && (this.i.isFile()))
/*  66:    */       {
/*  67: 80 */         g.debug("Loading http texture from local cache ({})", new Object[] { this.i });
/*  68:    */         try
/*  69:    */         {
/*  70: 82 */           this.l = ImageIO.read(this.i);
/*  71: 83 */           if (this.k != null) {
/*  72: 84 */             a(this.k.a(this.l));
/*  73:    */           }
/*  74:    */         }
/*  75:    */         catch (IOException localIOException)
/*  76:    */         {
/*  77: 87 */           g.error("Couldn't load skin " + this.i, localIOException);
/*  78: 88 */           d();
/*  79:    */         }
/*  80:    */       }
/*  81:    */       else
/*  82:    */       {
/*  83: 91 */         d();
/*  84:    */       }
/*  85:    */     }
/*  86:    */   }
/*  87:    */   
/*  88:    */   protected void d()
/*  89:    */   {
/*  90: 97 */     this.m = new ctr(this, "Texture Downloader #" + h.incrementAndGet());
/*  91:    */     
/*  92:    */ 
/*  93:    */ 
/*  94:    */ 
/*  95:    */ 
/*  96:    */ 
/*  97:    */ 
/*  98:    */ 
/*  99:    */ 
/* 100:    */ 
/* 101:    */ 
/* 102:    */ 
/* 103:    */ 
/* 104:    */ 
/* 105:    */ 
/* 106:    */ 
/* 107:    */ 
/* 108:    */ 
/* 109:    */ 
/* 110:    */ 
/* 111:    */ 
/* 112:    */ 
/* 113:    */ 
/* 114:    */ 
/* 115:    */ 
/* 116:    */ 
/* 117:    */ 
/* 118:    */ 
/* 119:    */ 
/* 120:    */ 
/* 121:    */ 
/* 122:    */ 
/* 123:    */ 
/* 124:    */ 
/* 125:    */ 
/* 126:    */ 
/* 127:    */ 
/* 128:135 */     this.m.setDaemon(true);
/* 129:136 */     this.m.start();
/* 130:    */   }
				static String a(ctq arg0) {return arg0.j;}
				static File b(ctq arg0) {return arg0.i;}
				static Logger f() {return g;}
				static ckh c(ctq arg0) {return arg0.k;}
/* 131:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ctq
 * JD-Core Version:    0.7.0.1
 */