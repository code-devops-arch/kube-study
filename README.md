maven build
mvn package

minikube ssh

#Building docker file into local minikube
docker build -t simple:latest -f ./Dockerfile .

#kube commands
kubectl apply -f E:\workspace\eclipse\kubernetes\service\nodeport-service.yml
kubectl apply -f path_to_simple\simple.yml


#test
curl http://{minikubeip}:30087/simple/welcome