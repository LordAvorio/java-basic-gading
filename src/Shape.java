class Shape {
    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape {

    int getCorner(){
        return 4;
    }

    //Super bisa mengakses parent field maupun method
    int getParentCorner(){
        return super.getCorner();
    }
    
}


