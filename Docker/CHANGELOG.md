Badge

1. Run a container
2. Run multiple containers
3. Remove the containers

Commands:
docker container run -t ubuntu top
docker container ls

echo 'from flask import Flask

app = Flask(__name__)

@app.route("/")
def hello():
    return "hello world!"

if __name__ == "__main__":
    app.run(host="0.0.0.0")' > app.py
    
Dockerfile

~/docker$ cat Dockerfile 
FROM python:3.6.1-alpine    // zbuduje jako child 
RUN pip install flask
CMD ["python","app.py"]
COPY app.py /app.py

docker image build -t python-hello-world .
i zbuduje ->>  python-hello-world    latest              fd71aeef1ba9        2 minutes ago       98.5MB

docker build .
i zbuduje ->>  <none>                <none>              15bc1dc437dd        3 seconds ago       98.5MB

docker run -p 5001:5000 -d python-hello-world
http://localhost:5001
docker container logs [container id]            // docker image ls
docker run python-hello-world

docker tag python-hello-world joannademo/python-hello-world
docker push joannademo/python-hello-world

