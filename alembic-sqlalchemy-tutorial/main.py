from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker

from models import UserModel

Session = sessionmaker(bind=create_engine("sqlite:///models.db"))

with Session() as session:
    users = session.query(UserModel).all()

    for user in users:        
        print(user)
