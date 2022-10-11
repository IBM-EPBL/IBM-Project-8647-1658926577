import socket
import sys
client=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
server_address=('localhost',1000)
client.connect(server_address)
message=input()
print("sending",message)
client.sendall(message.encode())
print("original:",message)
data=client.recv(10000).decode()
print("echo:",data)
client.close()