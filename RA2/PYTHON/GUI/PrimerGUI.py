import PyQt5.QtWidgets as qtw
import PyQt5.QtGui as qtg

class MainWindow(qtw.QWidget):
    def __init__(self):
        super().__init__()

        self.setWindowTitle("Primer GUI con PyQt5")
        self.setLayout(qtw.QVBoxLayout()) # un diseño de almacenar los elementos verticalmente

        texto = qtw.QLabel("Cuál es tu Nombre?")
        texto.setFont(qtg.QFont("Helvetica", 18))
        self.layout().addWidget(texto)

        nombre = qtw.QLineEdit()
        nombre.setObjectName("campo_nombre")
        nombre.setText("agregue su nombre...")
        self.layout().addWidget(nombre)

        #Se ejecuta una lambda expression
        boton = qtw.QPushButton("Ok", clicked = lambda: mostrar_nombre())
        self.layout().addWidget(boton)

        # Esto se ejecuta al final del Init
        self.show()

        def mostrar_nombre():
            texto.setText(f"Hola {nombre.text()}!!!")
            nombre.setText("")

if __name__ == "__main__":

    app = qtw.QApplication([])
    ventana = MainWindow()

    app.exec_()