package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class js
/*   4:    */   implements id<ik>
/*   5:    */ {
/*   6:    */   private int[] a;
/*   7:    */   private int[] b;
/*   8:    */   private jr[] c;
/*   9:    */   private boolean d;
/*  10:    */   
/*  11:    */   public js() {}
/*  12:    */   
/*  13:    */   public js(List paramList)
/*  14:    */   {
/*  15: 23 */     int i = paramList.size();
/*  16:    */     
/*  17: 25 */     this.a = new int[i];
/*  18: 26 */     this.b = new int[i];
/*  19: 27 */     this.c = new jr[i];
/*  20: 28 */     this.d = (!((Chunk)paramList.get(0)).p().t.o());
/*  21: 30 */     for (int j = 0; j < i; j++)
/*  22:    */     {
/*  23: 31 */       Chunk localbfh = (Chunk)paramList.get(j);
/*  24: 32 */       jr localjr = jq.a(localbfh, true, this.d, 65535);
/*  25:    */       
/*  26: 34 */       this.a[j] = localbfh.x;
/*  27: 35 */       this.b[j] = localbfh.z;
/*  28: 36 */       this.c[j] = localjr;
/*  29:    */     }
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void fromBuffer(ByteBufWrapper paramhd)
/*  33:    */   {
/*  34: 42 */     this.d = paramhd.readBoolean();
/*  35:    */     
/*  36: 44 */     int i = paramhd.e();
/*  37: 45 */     this.a = new int[i];
/*  38: 46 */     this.b = new int[i];
/*  39: 47 */     this.c = new jr[i];
/*  40: 49 */     for (int j = 0; j < i; j++)
/*  41:    */     {
/*  42: 50 */       this.a[j] = paramhd.readInt();
/*  43: 51 */       this.b[j] = paramhd.readInt();
/*  44: 52 */       this.c[j] = new jr();
/*  45: 53 */       this.c[j].b = (paramhd.readShort() & 0xFFFF);
/*  46: 54 */       this.c[j].a = new byte[jq.a(Integer.bitCount(this.c[j].b), this.d, true)];
/*  47:    */     }
/*  48: 57 */     for (int j = 0; j < i; j++) {
/*  49: 58 */       paramhd.readBytes(this.c[j].a);
/*  50:    */     }
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void toBuffer(ByteBufWrapper paramhd)
/*  54:    */   {
/*  55: 65 */     paramhd.writeBoolean(this.d);
/*  56: 66 */     paramhd.b(this.c.length);
/*  57: 68 */     for (int i = 0; i < this.a.length; i++)
/*  58:    */     {
/*  59: 69 */       paramhd.writeInt(this.a[i]);
/*  60: 70 */       paramhd.writeInt(this.b[i]);
/*  61: 71 */       paramhd.writeShort((short)(this.c[i].b & 0xFFFF));
/*  62:    */     }
/*  63: 74 */     for (int i = 0; i < this.a.length; i++) {
/*  64: 75 */       paramhd.writeBytes(this.c[i].a);
/*  65:    */     }
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void a(ik paramik)
/*  69:    */   {
/*  70: 81 */     paramik.a(this);
/*  71:    */   }
/*  72:    */   
/*  73:    */   public int a(int paramInt)
/*  74:    */   {
/*  75: 85 */     return this.a[paramInt];
/*  76:    */   }
/*  77:    */   
/*  78:    */   public int b(int paramInt)
/*  79:    */   {
/*  80: 89 */     return this.b[paramInt];
/*  81:    */   }
/*  82:    */   
/*  83:    */   public int a()
/*  84:    */   {
/*  85: 93 */     return this.a.length;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public byte[] c(int paramInt)
/*  89:    */   {
/*  90: 97 */     return this.c[paramInt].a;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public int d(int paramInt)
/*  94:    */   {
/*  95:101 */     return this.c[paramInt].b;
/*  96:    */   }
/*  97:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     js
 * JD-Core Version:    0.7.0.1
 */