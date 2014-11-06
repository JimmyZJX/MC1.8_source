package net.minecraft.src;
import tv.twitch.ErrorCode;
import tv.twitch.chat.ChatRawMessage;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatUserInfo;

public abstract interface dah
{
  public abstract void d(ErrorCode paramErrorCode);
  
  public abstract void e(ErrorCode paramErrorCode);
  
  public abstract void d();
  
  public abstract void e();
  
  public abstract void a(daf paramdaf);
  
  public abstract void a(String paramString, ChatTokenizedMessage[] paramArrayOfChatTokenizedMessage);
  
  public abstract void a(String paramString, ChatRawMessage[] paramArrayOfChatRawMessage);
  
  public abstract void a(String paramString, ChatUserInfo[] paramArrayOfChatUserInfo1, ChatUserInfo[] paramArrayOfChatUserInfo2, ChatUserInfo[] paramArrayOfChatUserInfo3);
  
  public abstract void a(String paramString);
  
  public abstract void b(String paramString);
  
  public abstract void a(String paramString1, String paramString2);
  
  public abstract void c(String paramString);
  
  public abstract void d(String paramString);
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     dah
 * JD-Core Version:    0.7.0.1
 */