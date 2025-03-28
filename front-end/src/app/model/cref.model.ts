import { Ref } from './ref.model';

export class Cref extends Ref {
  fieldSize: number;

  constructor(init?: Partial<Cref>) {
    super(init);
    Object.assign(this, init);
  }
}