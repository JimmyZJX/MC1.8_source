package net.minecraft.src;
/*   1:    */ import io.netty.buffer.ByteBuf;
/*   2:    */ import java.text.SimpleDateFormat;
/*   3:    */ import java.util.Date;
/*   4:    */ import net.minecraft.server.MinecraftServer;
/*   5:    */ 
/*   6:    */ public abstract class aqf
/*   7:    */   implements ICommandSender
/*   8:    */ {
/*   9: 23 */   private static final SimpleDateFormat a = new SimpleDateFormat("HH:mm:ss");
/*  10:    */   private int b;
/*  11: 29 */   private boolean c = true;
/*  12: 30 */   private ho d = null;
/*  13: 31 */   private String e = "";
/*  14: 32 */   private String f = "@";
/*  15: 33 */   private final af g = new af();
/*  16:    */   
/*  17:    */   public int j()
/*  18:    */   {
/*  19: 36 */     return this.b;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public ho k()
/*  23:    */   {
/*  24: 44 */     return this.d;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public void a(NBTTagCompound paramfn)
/*  28:    */   {
/*  29: 48 */     paramfn.setString("Command", this.e);
/*  30: 49 */     paramfn.setInt("SuccessCount", this.b);
/*  31: 50 */     paramfn.setString("CustomName", this.f);
/*  32: 51 */     paramfn.setBoolean("TrackOutput", this.c);
/*  33: 52 */     if ((this.d != null) && (this.c)) {
/*  34: 53 */       paramfn.setString("LastOutput", hp.a(this.d));
/*  35:    */     }
/*  36: 55 */     this.g.b(paramfn);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void b(NBTTagCompound paramfn)
/*  40:    */   {
/*  41: 59 */     this.e = paramfn.getString("Command");
/*  42: 60 */     this.b = paramfn.getInteger("SuccessCount");
/*  43: 61 */     if (paramfn.hasKey("CustomName", 8)) {
/*  44: 62 */       this.f = paramfn.getString("CustomName");
/*  45:    */     }
/*  46: 64 */     if (paramfn.hasKey("TrackOutput", 1)) {
/*  47: 65 */       this.c = paramfn.getBoolean("TrackOutput");
/*  48:    */     }
/*  49: 67 */     if ((paramfn.hasKey("LastOutput", 8)) && (this.c)) {
/*  50: 68 */       this.d = hp.a(paramfn.getString("LastOutput"));
/*  51:    */     }
/*  52: 70 */     this.g.a(paramfn);
/*  53:    */   }
/*  54:    */   
/*  55:    */   public boolean a(int paramInt, String paramString)
/*  56:    */   {
/*  57: 75 */     return paramInt <= 2;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void a(String paramString)
/*  61:    */   {
/*  62: 79 */     this.e = paramString;
/*  63: 80 */     this.b = 0;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String l()
/*  67:    */   {
/*  68: 84 */     return this.e;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void a(World paramaqu)
/*  72:    */   {
/*  73: 88 */     if (paramaqu.isClient) {
/*  74: 89 */       this.b = 0;
/*  75:    */     }
/*  76: 92 */     MinecraftServer localMinecraftServer = MinecraftServer.M();
/*  77: 93 */     if ((localMinecraftServer != null) && (localMinecraftServer.N()) && (localMinecraftServer.aj()))
/*  78:    */     {
/*  79: 94 */       ad localad = localMinecraftServer.O();
/*  80:    */       try
/*  81:    */       {
/*  82: 96 */         this.d = null;
/*  83: 97 */         this.b = localad.a(this, this.e);
/*  84:    */       }
/*  85:    */       catch (Throwable localThrowable)
/*  86:    */       {
/*  87: 99 */         b localb = net.minecraft.src.b.a(localThrowable, "Executing command block");
/*  88:100 */         j localj = localb.a("Command to be executed");
/*  89:    */         
/*  90:102 */         localj.a("Command", new aqg(this));
/*  91:    */         
/*  92:    */ 
/*  93:    */ 
/*  94:    */ 
/*  95:    */ 
/*  96:    */ 
/*  97:109 */         localj.a("Name", new aqh(this));
/*  98:    */         
/*  99:    */ 
/* 100:    */ 
/* 101:    */ 
/* 102:    */ 
/* 103:    */ 
/* 104:116 */         throw new u(localb);
/* 105:    */       }
/* 106:    */     }
/* 107:    */     else
/* 108:    */     {
/* 109:119 */       this.b = 0;
/* 110:    */     }
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getName()
/* 114:    */   {
/* 115:125 */     return this.f;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public ho e_()
/* 119:    */   {
/* 120:130 */     return new hy(getName());
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void b(String paramString)
/* 124:    */   {
/* 125:134 */     this.f = paramString;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void a(ho paramho)
/* 129:    */   {
/* 130:139 */     if ((this.c) && (e() != null) && (!e().isClient))
/* 131:    */     {
/* 132:140 */       this.d = new hy("[" + a.format(new Date()) + "] ").a(paramho);
/* 133:141 */       h();
/* 134:    */     }
/* 135:    */   }
/* 136:    */   
/* 137:    */   public boolean t_()
/* 138:    */   {
/* 139:147 */     MinecraftServer localMinecraftServer = MinecraftServer.M();
/* 140:148 */     return (localMinecraftServer == null) || (!localMinecraftServer.N()) || (localMinecraftServer.c[0].getGameRules().getBoolean("commandBlockOutput"));
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void a(ag paramag, int paramInt)
/* 144:    */   {
/* 145:153 */     this.g.a(this, paramag, paramInt);
/* 146:    */   }
/* 147:    */   
/* 148:    */   public abstract void h();
/* 149:    */   
/* 150:    */   public abstract int i();
/* 151:    */   
/* 152:    */   public abstract void a(ByteBuf paramByteBuf);
/* 153:    */   
/* 154:    */   public void b(ho paramho)
/* 155:    */   {
/* 156:163 */     this.d = paramho;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void a(boolean paramBoolean)
/* 160:    */   {
/* 161:167 */     this.c = paramBoolean;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public boolean m()
/* 165:    */   {
/* 166:171 */     return this.c;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public boolean a(EntityPlayer paramahd)
/* 170:    */   {
/* 171:175 */     if (!paramahd.by.d) {
/* 172:176 */       return false;
/* 173:    */     }
/* 174:178 */     if (paramahd.e().isClient) {
/* 175:179 */       paramahd.a(this);
/* 176:    */     }
/* 177:181 */     return true;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public af n()
/* 181:    */   {
/* 182:185 */     return this.g;
/* 183:    */   }
/* 184:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqf
 * JD-Core Version:    0.7.0.1
 */