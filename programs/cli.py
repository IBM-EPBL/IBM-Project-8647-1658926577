import socket
S=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
host=socket.gethostname()
port=1234
S.connect((host,port))
print(S.recv(1024))
S.close()