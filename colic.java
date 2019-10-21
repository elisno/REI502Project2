java weka.associations.Apriori -I -N 1000 -T 0 -C 0.9 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c -1 -t ./horse-colic-support.arff > support.txt
java weka.associations.Apriori -I -R -N 1000 -T 0 -C 0.95 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c 24 -t ./horse-colic-metric.arff > confidence.txt
java weka.associations.Apriori -I -R -N 1000 -T 1 -C 4.0 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c 24 -t ./horse-colic-metric.arff > lift.txt
java weka.associations.Apriori -N 100 -T 2 -C 0.1 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c -1 -t ./horse-colic-metric.arff > leverage.txt
java weka.associations.Apriori -N 100 -T 3 -C 2.0 -D 0.05 -U 1.0 -M 0.1 -S -1.0 -c -1 -t ./horse-colic-metric.arff > conviction.txt
java weka.associations.Apriori -R -N 1000 -T 1 -C 4.0 -D 0.05 -U 0.42 -M 0.1 -S 0.01 -c 20 -t ./horse-colic-final.arff > final-rule-generation.txt
