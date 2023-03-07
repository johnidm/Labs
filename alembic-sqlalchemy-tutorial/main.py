from sqlalchemy import create_engine, text
from sqlalchemy.orm import sessionmaker

from models import UserModel

engine = "sqlite:///models.db"
# engine = 'postgresql+psycopg2://root:root@localhost:5432/models'

connectable = create_engine(engine)

Session = sessionmaker(bind=connectable)

from sqlalchemy.event import listens_for
from sqlalchemy.pool import Pool

@listens_for(Pool, "connect")
def my_on_connect(dbapi_con, connection_record):
    breakpoint()
    if connectable.name == 'sqlite':
        dbapi_con.execute("ATTACH DATABASE 'models.db' AS prod01sa")
    
with Session() as session:
    breakpoint()
    users = session.query(UserModel).all()

    for user in users:        
        print(user)
