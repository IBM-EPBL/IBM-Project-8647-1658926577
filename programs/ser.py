import socket
S=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
print ("socket created successfully")
host=socket.gethostname()
port=1234
S.bind((host,port))
print("socket binded to",port)
S.listen(3)
print("socket is listening")
while True:
  conn.addr=S.accept()
print("got connection from:",addr)
msg="thanks for connecting"
conn.send (msg.encode())
conn.close()